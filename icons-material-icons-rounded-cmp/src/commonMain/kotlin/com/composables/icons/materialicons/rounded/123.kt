package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`123`: ImageVector
    get() {
        if (_123 != null) return _123!!
        
        _123 = ImageVector.Builder(
            name = "123",
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4.75f, 10.5f)
                    curveTo(4.34f, 10.5f, 4f, 10.16f, 4f, 9.75f)
                    reflectiveCurveTo(4.34f, 9f, 4.75f, 9f)
                    horizontalLineTo(6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveTo(7f, 14.66f, 6.66f, 15f, 6.25f, 15f)
                    reflectiveCurveTo(5.5f, 14.66f, 5.5f, 14.25f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(4.75f)
                    close()
                    moveTo(9.75f, 9f)
                    curveTo(9.34f, 9f, 9f, 9.34f, 9f, 9.75f)
                    reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.75f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    horizontalLineTo(10.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(9.75f)
                    close()
                    moveTo(18.5f, 15f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2.75f)
                    curveTo(15.34f, 9f, 15f, 9.34f, 15f, 9.75f)
                    reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                    reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2.25f)
                    curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                    reflectiveCurveTo(15.34f, 15f, 15.75f, 15f)
                    horizontalLineTo(18.5f)
                    close()
                }
            }
        }.build()
        
        return _123!!
    }

private var _123: ImageVector? = null

