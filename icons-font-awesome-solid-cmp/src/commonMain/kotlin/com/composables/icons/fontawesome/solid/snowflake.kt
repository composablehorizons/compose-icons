package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Snowflake: ImageVector
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
                moveTo(440.3f, 345.2f)
                lineToRelative(-33.8f, -19.5f)
                lineToRelative(26f, -7f)
                curveToRelative(8.2f, -2.2f, 13.1f, -10.7f, 10.9f, -18.9f)
                lineToRelative(-4f, -14.9f)
                curveToRelative(-2.2f, -8.2f, -10.7f, -13.1f, -18.9f, -10.9f)
                lineToRelative(-70.8f, 19f)
                lineToRelative(-63.9f, -37f)
                lineToRelative(63.8f, -36.9f)
                lineToRelative(70.8f, 19f)
                curveToRelative(8.2f, 2.2f, 16.7f, -2.7f, 18.9f, -10.9f)
                lineToRelative(4f, -14.9f)
                curveToRelative(2.2f, -8.2f, -2.7f, -16.7f, -10.9f, -18.9f)
                lineToRelative(-26f, -7f)
                lineToRelative(33.8f, -19.5f)
                curveToRelative(7.4f, -4.3f, 9.9f, -13.7f, 5.7f, -21.1f)
                lineTo(430.4f, 119f)
                curveToRelative(-4.3f, -7.4f, -13.7f, -9.9f, -21.1f, -5.7f)
                lineToRelative(-33.8f, 19.5f)
                lineToRelative(7f, -26f)
                curveToRelative(2.2f, -8.2f, -2.7f, -16.7f, -10.9f, -18.9f)
                lineToRelative(-14.9f, -4f)
                curveToRelative(-8.2f, -2.2f, -16.7f, 2.7f, -18.9f, 10.9f)
                lineToRelative(-19f, 70.8f)
                lineToRelative(-62.8f, 36.2f)
                verticalLineToRelative(-77.5f)
                lineToRelative(53.7f, -53.7f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0f, -22.6f)
                lineToRelative(-11.3f, -11.3f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                lineTo(256f, 56.4f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(40.4f)
                lineToRelative(-19.7f, -19.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                lineTo(138.3f, 48f)
                curveToRelative(-6.3f, 6.2f, -6.3f, 16.4f, 0f, 22.6f)
                lineToRelative(53.7f, 53.7f)
                verticalLineToRelative(77.5f)
                lineToRelative(-62.8f, -36.2f)
                lineToRelative(-19f, -70.8f)
                curveToRelative(-2.2f, -8.2f, -10.7f, -13.1f, -18.9f, -10.9f)
                lineToRelative(-14.9f, 4f)
                curveToRelative(-8.2f, 2.2f, -13.1f, 10.7f, -10.9f, 18.9f)
                lineToRelative(7f, 26f)
                lineToRelative(-33.8f, -19.5f)
                curveToRelative(-7.4f, -4.3f, -16.8f, -1.7f, -21.1f, 5.7f)
                lineTo(2.1f, 145.7f)
                curveToRelative(-4.3f, 7.4f, -1.7f, 16.8f, 5.7f, 21.1f)
                lineToRelative(33.8f, 19.5f)
                lineToRelative(-26f, 7f)
                curveToRelative(-8.3f, 2.2f, -13.2f, 10.7f, -11f, 19f)
                lineToRelative(4f, 14.9f)
                curveToRelative(2.2f, 8.2f, 10.7f, 13.1f, 18.9f, 10.9f)
                lineToRelative(70.8f, -19f)
                lineToRelative(63.8f, 36.9f)
                lineToRelative(-63.8f, 36.9f)
                lineToRelative(-70.8f, -19f)
                curveToRelative(-8.2f, -2.2f, -16.7f, 2.7f, -18.9f, 10.9f)
                lineToRelative(-4f, 14.9f)
                curveToRelative(-2.2f, 8.2f, 2.7f, 16.7f, 10.9f, 18.9f)
                lineToRelative(26f, 7f)
                lineToRelative(-33.8f, 19.6f)
                curveToRelative(-7.4f, 4.3f, -9.9f, 13.7f, -5.7f, 21.1f)
                lineToRelative(15.5f, 26.8f)
                curveToRelative(4.3f, 7.4f, 13.7f, 9.9f, 21.1f, 5.7f)
                lineToRelative(33.8f, -19.5f)
                lineToRelative(-7f, 26f)
                curveToRelative(-2.2f, 8.2f, 2.7f, 16.7f, 10.9f, 18.9f)
                lineToRelative(14.9f, 4f)
                curveToRelative(8.2f, 2.2f, 16.7f, -2.7f, 18.9f, -10.9f)
                lineToRelative(19f, -70.8f)
                lineToRelative(62.8f, -36.2f)
                verticalLineToRelative(77.5f)
                lineToRelative(-53.7f, 53.7f)
                curveToRelative(-6.3f, 6.2f, -6.3f, 16.4f, 0f, 22.6f)
                lineToRelative(11.3f, 11.3f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0f)
                lineToRelative(19.7f, -19.7f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-40.4f)
                lineToRelative(19.7f, 19.7f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0f, -22.6f)
                lineTo(256f, 387.7f)
                verticalLineToRelative(-77.5f)
                lineToRelative(62.8f, 36.2f)
                lineToRelative(19f, 70.8f)
                curveToRelative(2.2f, 8.2f, 10.7f, 13.1f, 18.9f, 10.9f)
                lineToRelative(14.9f, -4f)
                curveToRelative(8.2f, -2.2f, 13.1f, -10.7f, 10.9f, -18.9f)
                lineToRelative(-7f, -26f)
                lineToRelative(33.8f, 19.5f)
                curveToRelative(7.4f, 4.3f, 16.8f, 1.7f, 21.1f, -5.7f)
                lineToRelative(15.5f, -26.8f)
                curveToRelative(4.3f, -7.3f, 1.8f, -16.8f, -5.6f, -21f)
                close()
            }
        }.build()
        
        return _Snowflake!!
    }

private var _Snowflake: ImageVector? = null

