package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_transfer: ImageVector
    get() {
        if (_No_transfer != null) return _No_transfer!!
        
        _No_transfer = ImageVector.Builder(
            name = "no_transfer",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.83f, 12f)
                horizontalLineTo(18f)
                verticalLineToRelative(3.17f)
                lineTo(14.83f, 12f)
                close()
                moveTo(9.17f, 12f)
                lineToRelative(5f, 5f)
                horizontalLineTo(6.63f)
                lineToRelative(-0.29f, -0.27f)
                curveTo(6.21f, 16.62f, 6f, 16.37f, 6f, 16f)
                verticalLineToRelative(-4f)
                horizontalLineTo(9.17f)
                close()
                moveTo(10f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(7f, 13.67f, 7f, 14.5f)
                curveTo(7f, 15.33f, 7.67f, 16f, 8.5f, 16f)
                reflectiveCurveTo(10f, 15.33f, 10f, 14.5f)
                close()
                moveTo(7.82f, 4.99f)
                horizontalLineToRelative(9.83f)
                curveTo(17.11f, 4.46f, 15.69f, 4f, 12f, 4f)
                curveTo(9.6f, 4f, 8.17f, 4.2f, 7.31f, 4.48f)
                lineTo(7.82f, 4.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 16f, 8.5f, 16f)
                reflectiveCurveTo(7f, 15.33f, 7f, 14.5f)
                reflectiveCurveTo(7.67f, 13f, 8.5f, 13f)
                close()
                moveTo(7.31f, 4.48f)
                curveTo(8.17f, 4.2f, 9.6f, 4f, 12f, 4f)
                curveToRelative(3.69f, 0f, 5.11f, 0.46f, 5.66f, 0.99f)
                horizontalLineTo(7.82f)
                lineToRelative(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(18f)
                verticalLineToRelative(3.17f)
                lineToRelative(1.81f, 1.81f)
                curveTo(19.92f, 16.67f, 20f, 16.35f, 20f, 16f)
                verticalLineTo(6f)
                curveToRelative(0f, -3.5f, -3.58f, -4f, -8f, -4f)
                curveTo(9.48f, 2f, 7.24f, 2.16f, 5.78f, 2.95f)
                lineTo(7.31f, 4.48f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-1.64f, -1.64f)
                curveTo(18.09f, 20.98f, 18.05f, 21f, 18f, 21f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.78f)
                curveTo(4.39f, 17.67f, 4f, 16.88f, 4f, 16f)
                verticalLineTo(6.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(6f, 8.83f)
                verticalLineTo(10f)
                horizontalLineToRelative(1.17f)
                lineTo(6f, 8.83f)
                close()
                moveTo(14.17f, 17f)
                lineToRelative(-5f, -5f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.37f, 0.21f, 0.62f, 0.34f, 0.73f)
                lineTo(6.63f, 17f)
                horizontalLineTo(8f)
                horizontalLineTo(14.17f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

