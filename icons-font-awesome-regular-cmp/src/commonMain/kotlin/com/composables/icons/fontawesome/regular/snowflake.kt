package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Snowflake: ImageVector
    get() {
        if (_Snowflake != null) return _Snowflake!!
        
        _Snowflake = ImageVector.Builder(
            name = "snowflake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440.1f, 355.2f)
                lineToRelative(-39.2f, -23f)
                lineToRelative(34.1f, -9.3f)
                curveToRelative(8.4f, -2.3f, 13.4f, -11.1f, 11.1f, -19.6f)
                lineToRelative(-4.1f, -15.5f)
                curveToRelative(-2.2f, -8.5f, -10.9f, -13.6f, -19.3f, -11.3f)
                lineTo(343f, 298.2f)
                lineTo(271.2f, 256f)
                lineToRelative(71.9f, -42.2f)
                lineToRelative(79.7f, 21.7f)
                curveToRelative(8.4f, 2.3f, 17f, -2.8f, 19.3f, -11.3f)
                lineToRelative(4.1f, -15.5f)
                curveToRelative(2.2f, -8.5f, -2.7f, -17.3f, -11.1f, -19.6f)
                lineToRelative(-34.1f, -9.3f)
                lineToRelative(39.2f, -23f)
                curveToRelative(7.5f, -4.4f, 10.1f, -14.2f, 5.8f, -21.9f)
                lineToRelative(-7.9f, -13.9f)
                curveToRelative(-4.3f, -7.7f, -14f, -10.3f, -21.5f, -5.9f)
                lineToRelative(-39.2f, 23f)
                lineToRelative(9.1f, -34.7f)
                curveToRelative(2.2f, -8.5f, -2.7f, -17.3f, -11.1f, -19.6f)
                lineToRelative(-15.2f, -4.1f)
                curveToRelative(-8.4f, -2.3f, -17f, 2.8f, -19.3f, 11.3f)
                lineToRelative(-21.3f, 81f)
                lineToRelative(-71.9f, 42.2f)
                verticalLineToRelative(-84.5f)
                lineTo(306f, 70.4f)
                curveToRelative(6.1f, -6.2f, 6.1f, -16.4f, 0f, -22.6f)
                lineToRelative(-11.1f, -11.3f)
                curveToRelative(-6.1f, -6.2f, -16.1f, -6.2f, -22.2f, 0f)
                lineToRelative(-24.9f, 25.4f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7f, -16f, -15.7f, -16f)
                horizontalLineToRelative(-15.7f)
                curveToRelative(-8.7f, 0f, -15.7f, 7.2f, -15.7f, 16f)
                verticalLineToRelative(46.1f)
                lineToRelative(-24.9f, -25.4f)
                curveToRelative(-6.1f, -6.2f, -16.1f, -6.2f, -22.2f, 0f)
                lineTo(142.1f, 48f)
                curveToRelative(-6.1f, 6.2f, -6.1f, 16.4f, 0f, 22.6f)
                lineToRelative(58.3f, 59.3f)
                verticalLineToRelative(84.5f)
                lineToRelative(-71.9f, -42.2f)
                lineToRelative(-21.3f, -81f)
                curveToRelative(-2.2f, -8.5f, -10.9f, -13.6f, -19.3f, -11.3f)
                lineTo(72.7f, 84f)
                curveToRelative(-8.4f, 2.3f, -13.4f, 11.1f, -11.1f, 19.6f)
                lineToRelative(9.1f, 34.7f)
                lineToRelative(-39.2f, -23f)
                curveToRelative(-7.5f, -4.4f, -17.1f, -1.8f, -21.5f, 5.9f)
                lineToRelative(-7.9f, 13.9f)
                curveToRelative(-4.3f, 7.7f, -1.8f, 17.4f, 5.8f, 21.9f)
                lineToRelative(39.2f, 23f)
                lineToRelative(-34.1f, 9.1f)
                curveToRelative(-8.4f, 2.3f, -13.4f, 11.1f, -11.1f, 19.6f)
                lineTo(6f, 224.2f)
                curveToRelative(2.2f, 8.5f, 10.9f, 13.6f, 19.3f, 11.3f)
                lineToRelative(79.7f, -21.7f)
                lineToRelative(71.9f, 42.2f)
                lineToRelative(-71.9f, 42.2f)
                lineToRelative(-79.7f, -21.7f)
                curveToRelative(-8.4f, -2.3f, -17f, 2.8f, -19.3f, 11.3f)
                lineToRelative(-4.1f, 15.5f)
                curveToRelative(-2.2f, 8.5f, 2.7f, 17.3f, 11.1f, 19.6f)
                lineToRelative(34.1f, 9.3f)
                lineToRelative(-39.2f, 23f)
                curveToRelative(-7.5f, 4.4f, -10.1f, 14.2f, -5.8f, 21.9f)
                lineTo(10f, 391f)
                curveToRelative(4.3f, 7.7f, 14f, 10.3f, 21.5f, 5.9f)
                lineToRelative(39.2f, -23f)
                lineToRelative(-9.1f, 34.7f)
                curveToRelative(-2.2f, 8.5f, 2.7f, 17.3f, 11.1f, 19.6f)
                lineToRelative(15.2f, 4.1f)
                curveToRelative(8.4f, 2.3f, 17f, -2.8f, 19.3f, -11.3f)
                lineToRelative(21.3f, -81f)
                lineToRelative(71.9f, -42.2f)
                verticalLineToRelative(84.5f)
                lineToRelative(-58.3f, 59.3f)
                curveToRelative(-6.1f, 6.2f, -6.1f, 16.4f, 0f, 22.6f)
                lineToRelative(11.1f, 11.3f)
                curveToRelative(6.1f, 6.2f, 16.1f, 6.2f, 22.2f, 0f)
                lineToRelative(24.9f, -25.4f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.8f, 7f, 16f, 15.7f, 16f)
                horizontalLineToRelative(15.7f)
                curveToRelative(8.7f, 0f, 15.7f, -7.2f, 15.7f, -16f)
                verticalLineToRelative(-46.1f)
                lineToRelative(24.9f, 25.4f)
                curveToRelative(6.1f, 6.2f, 16.1f, 6.2f, 22.2f, 0f)
                lineToRelative(11.1f, -11.3f)
                curveToRelative(6.1f, -6.2f, 6.1f, -16.4f, 0f, -22.6f)
                lineToRelative(-58.3f, -59.3f)
                verticalLineToRelative(-84.5f)
                lineToRelative(71.9f, 42.2f)
                lineToRelative(21.3f, 81f)
                curveToRelative(2.2f, 8.5f, 10.9f, 13.6f, 19.3f, 11.3f)
                lineTo(375f, 428f)
                curveToRelative(8.4f, -2.3f, 13.4f, -11.1f, 11.1f, -19.6f)
                lineToRelative(-9.1f, -34.7f)
                lineToRelative(39.2f, 23f)
                curveToRelative(7.5f, 4.4f, 17.1f, 1.8f, 21.5f, -5.9f)
                lineToRelative(7.9f, -13.9f)
                curveToRelative(4.6f, -7.5f, 2.1f, -17.3f, -5.5f, -21.7f)
                close()
            }
        }.build()
        
        return _Snowflake!!
    }

private var _Snowflake: ImageVector? = null

