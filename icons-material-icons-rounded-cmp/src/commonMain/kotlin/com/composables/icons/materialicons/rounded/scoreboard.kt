package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Scoreboard: ImageVector
    get() {
        if (_Scoreboard != null) return _Scoreboard!!
        
        _Scoreboard = ImageVector.Builder(
            name = "scoreboard",
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
                    moveTo(17.5f, 13.5f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(16f, 2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(9f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(7f, 2.45f, 7f, 3f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(3f)
                    curveTo(17f, 2.45f, 16.55f, 2f, 16f, 2f)
                    close()
                    moveTo(9.5f, 14.25f)
                    curveTo(9.5f, 14.66f, 9.16f, 15f, 8.75f, 15f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(5.75f)
                    curveTo(5.34f, 10.5f, 5f, 10.16f, 5f, 9.75f)
                    reflectiveCurveTo(5.34f, 9f, 5.75f, 9f)
                    horizontalLineTo(8.5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2.25f)
                    curveTo(9.16f, 13.5f, 9.5f, 13.84f, 9.5f, 14.25f)
                    close()
                    moveTo(19f, 14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(18f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                    moveTo(12.75f, 6.75f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 6f, 12f, 6f)
                    reflectiveCurveTo(12.75f, 6.34f, 12.75f, 6.75f)
                    close()
                    moveTo(12.75f, 10.25f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 9.5f, 12f, 9.5f)
                    reflectiveCurveTo(12.75f, 9.84f, 12.75f, 10.25f)
                    close()
                    moveTo(12.75f, 13.75f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 13f, 12f, 13f)
                    reflectiveCurveTo(12.75f, 13.34f, 12.75f, 13.75f)
                    close()
                    moveTo(12.75f, 17.25f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 16.5f, 12f, 16.5f)
                    reflectiveCurveTo(12.75f, 16.84f, 12.75f, 17.25f)
                    close()
                }
            }
        }.build()
        
        return _Scoreboard!!
    }

private var _Scoreboard: ImageVector? = null

