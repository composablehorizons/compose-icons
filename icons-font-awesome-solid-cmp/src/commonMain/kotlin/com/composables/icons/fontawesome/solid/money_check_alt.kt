package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MoneyCheckAlt: ImageVector
    get() {
        if (_MoneyCheckAlt != null) return _MoneyCheckAlt!!
        
        _MoneyCheckAlt = ImageVector.Builder(
            name = "money-check-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 32f, 0f, 46.33f, 0f, 64f)
                verticalLineToRelative(384f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(576f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(176f, 327.88f)
                verticalLineTo(344f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16.29f)
                curveToRelative(-11.29f, -0.58f, -22.27f, -4.52f, -31.37f, -11.35f)
                curveToRelative(-3.9f, -2.93f, -4.1f, -8.77f, -0.57f, -12.14f)
                lineToRelative(11.75f, -11.21f)
                curveToRelative(2.77f, -2.64f, 6.89f, -2.76f, 10.13f, -0.73f)
                curveToRelative(3.87f, 2.42f, 8.26f, 3.72f, 12.82f, 3.72f)
                horizontalLineToRelative(28.11f)
                curveToRelative(6.5f, 0f, 11.8f, -5.92f, 11.8f, -13.19f)
                curveToRelative(0f, -5.95f, -3.61f, -11.19f, -8.77f, -12.73f)
                lineToRelative(-45f, -13.5f)
                curveToRelative(-18.59f, -5.58f, -31.58f, -23.42f, -31.58f, -43.39f)
                curveToRelative(0f, -24.52f, 19.05f, -44.44f, 42.67f, -45.07f)
                verticalLineTo(152f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16.29f)
                curveToRelative(11.29f, 0.58f, 22.27f, 4.51f, 31.37f, 11.35f)
                curveToRelative(3.9f, 2.93f, 4.1f, 8.77f, 0.57f, 12.14f)
                lineToRelative(-11.75f, 11.21f)
                curveToRelative(-2.77f, 2.64f, -6.89f, 2.76f, -10.13f, 0.73f)
                curveToRelative(-3.87f, -2.43f, -8.26f, -3.72f, -12.82f, -3.72f)
                horizontalLineToRelative(-28.11f)
                curveToRelative(-6.5f, 0f, -11.8f, 5.92f, -11.8f, 13.19f)
                curveToRelative(0f, 5.95f, 3.61f, 11.19f, 8.77f, 12.73f)
                lineToRelative(45f, 13.5f)
                curveToRelative(18.59f, 5.58f, 31.58f, 23.42f, 31.58f, 43.39f)
                curveToRelative(0f, 24.53f, -19.05f, 44.44f, -42.67f, 45.07f)
                close()
                moveTo(416f, 312f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(296f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(112f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-80f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(80f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(296f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(272f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _MoneyCheckAlt!!
    }

private var _MoneyCheckAlt: ImageVector? = null

