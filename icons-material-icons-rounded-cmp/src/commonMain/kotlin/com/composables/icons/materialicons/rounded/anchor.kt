package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Anchor: ImageVector
    get() {
        if (_Anchor != null) return _Anchor!!
        
        _Anchor = ImageVector.Builder(
            name = "anchor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 9f)
                    verticalLineTo(7.82f)
                    curveTo(14.16f, 7.4f, 15f, 6.3f, 15f, 5f)
                    curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                    reflectiveCurveTo(9f, 3.35f, 9f, 5f)
                    curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                    verticalLineTo(9f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(8.92f)
                    curveToRelative(-2.22f, -0.33f, -4.59f, -1.68f, -5.55f, -3.37f)
                    lineToRelative(1.14f, -1.14f)
                    curveToRelative(0.22f, -0.22f, 0.19f, -0.57f, -0.05f, -0.75f)
                    lineTo(3.8f, 12.6f)
                    curveTo(3.47f, 12.35f, 3f, 12.59f, 3f, 13f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 3.88f, 4.92f, 7f, 9f, 7f)
                    reflectiveCurveToRelative(9f, -3.12f, 9f, -7f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.41f, -0.47f, -0.65f, -0.8f, -0.4f)
                    lineToRelative(-2.74f, 2.05f)
                    curveToRelative(-0.24f, 0.18f, -0.27f, 0.54f, -0.05f, 0.75f)
                    lineToRelative(1.14f, 1.14f)
                    curveToRelative(-0.96f, 1.69f, -3.33f, 3.04f, -5.55f, 3.37f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveTo(11.45f, 4f, 12f, 4f)
                    close()
                }
            }
        }.build()
        
        return _Anchor!!
    }

private var _Anchor: ImageVector? = null

