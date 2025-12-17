package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Synagogue: ImageVector
    get() {
        if (_Synagogue != null) return _Synagogue!!
        
        _Synagogue = ImageVector.Builder(
            name = "synagogue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(70f, 196.51f)
                lineTo(6.67f, 268.29f)
                arcTo(26.643f, 26.643f, 0f, false, false, 0f, 285.93f)
                verticalLineTo(512f)
                horizontalLineToRelative(128f)
                verticalLineTo(239.58f)
                lineToRelative(-38f, -43.07f)
                curveToRelative(-5.31f, -6.01f, -14.69f, -6.01f, -20f, 0f)
                close()
                moveToRelative(563.33f, 71.78f)
                lineTo(570f, 196.51f)
                curveToRelative(-5.31f, -6.02f, -14.69f, -6.02f, -20f, 0f)
                lineToRelative(-38f, 43.07f)
                verticalLineTo(512f)
                horizontalLineToRelative(128f)
                verticalLineTo(285.93f)
                curveToRelative(0f, -6.5f, -2.37f, -12.77f, -6.67f, -17.64f)
                close()
                moveTo(339.99f, 7.01f)
                curveToRelative(-11.69f, -9.35f, -28.29f, -9.35f, -39.98f, 0f)
                lineToRelative(-128f, 102.4f)
                arcTo(32.005f, 32.005f, 0f, false, false, 160f, 134.4f)
                verticalLineTo(512f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-92.57f)
                curveToRelative(0f, -31.88f, 21.78f, -61.43f, 53.25f, -66.55f)
                curveTo(349.34f, 346.35f, 384f, 377.13f, 384f, 416f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(96f)
                verticalLineTo(134.4f)
                curveToRelative(0f, -9.72f, -4.42f, -18.92f, -12.01f, -24.99f)
                lineToRelative(-128f, -102.4f)
                close()
                moveToRelative(52.07f, 215.55f)
                curveToRelative(1.98f, 3.15f, -0.29f, 7.24f, -4f, 7.24f)
                horizontalLineToRelative(-38.94f)
                lineTo(324f, 269.79f)
                curveToRelative(-1.85f, 2.95f, -6.15f, 2.95f, -8f, 0f)
                lineToRelative(-25.12f, -39.98f)
                horizontalLineToRelative(-38.94f)
                curveToRelative(-3.72f, 0f, -5.98f, -4.09f, -4f, -7.24f)
                lineToRelative(19.2f, -30.56f)
                lineToRelative(-19.2f, -30.56f)
                curveToRelative(-1.98f, -3.15f, 0.29f, -7.24f, 4f, -7.24f)
                horizontalLineToRelative(38.94f)
                lineToRelative(25.12f, -40f)
                curveToRelative(1.85f, -2.95f, 6.15f, -2.95f, 8f, 0f)
                lineToRelative(25.12f, 39.98f)
                horizontalLineToRelative(38.95f)
                curveToRelative(3.71f, 0f, 5.98f, 4.09f, 4f, 7.24f)
                lineTo(372.87f, 192f)
                lineToRelative(19.19f, 30.56f)
                close()
            }
        }.build()
        
        return _Synagogue!!
    }

private var _Synagogue: ImageVector? = null

