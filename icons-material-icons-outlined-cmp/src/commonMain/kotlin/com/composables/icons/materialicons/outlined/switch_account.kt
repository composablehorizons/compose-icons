package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Switch_account: ImageVector
    get() {
        if (_Switch_account != null) return _Switch_account!!
        
        _Switch_account = ImageVector.Builder(
            name = "switch_account",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    close()
                    moveTo(14f, 11f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                    curveTo(11f, 9.66f, 12.34f, 11f, 14f, 11f)
                    close()
                    moveTo(14f, 7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveTo(13.45f, 7f, 14f, 7f)
                    close()
                    moveTo(20f, 2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(10.69f, 16f)
                    curveToRelative(0.95f, -0.63f, 2.09f, -1f, 3.31f, -1f)
                    reflectiveCurveToRelative(2.36f, 0.37f, 3.31f, 1f)
                    horizontalLineTo(10.69f)
                    close()
                    moveTo(20f, 15.73f)
                    curveTo(18.53f, 14.06f, 16.4f, 13f, 14f, 13f)
                    reflectiveCurveToRelative(-4.53f, 1.06f, -6f, 2.73f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(15.73f)
                    close()
                }
            }
        }.build()
        
        return _Switch_account!!
    }

private var _Switch_account: ImageVector? = null

