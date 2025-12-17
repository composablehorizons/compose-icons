package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Checklist: ImageVector
    get() {
        if (_Checklist != null) return _Checklist!!
        
        _Checklist = ImageVector.Builder(
            name = "checklist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 8f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(7f)
                    curveTo(21.55f, 9f, 22f, 8.55f, 22f, 8f)
                    close()
                    moveTo(13f, 16f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(7f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-7f)
                    curveTo(13.45f, 15f, 13f, 15.45f, 13f, 16f)
                    close()
                    moveTo(10.47f, 4.63f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-4.23f, 4.25f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0f)
                    lineTo(2.7f, 8.16f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.42f, 1.42f)
                    lineToRelative(3.54f, -3.54f)
                    curveTo(9.45f, 4.25f, 10.09f, 4.25f, 10.47f, 4.63f)
                    close()
                    moveTo(10.48f, 12.64f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-4.23f, 4.25f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0f)
                    lineTo(2.7f, 16.16f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(1.42f, 1.42f)
                    lineToRelative(3.54f, -3.54f)
                    curveTo(9.45f, 12.25f, 10.09f, 12.25f, 10.48f, 12.64f)
                    lineTo(10.48f, 12.64f)
                    close()
                }
            }
        }.build()
        
        return _Checklist!!
    }

private var _Checklist: ImageVector? = null

