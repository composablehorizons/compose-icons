package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.MoneyBillAlt: ImageVector
    get() {
        if (_MoneyBillAlt != null) return _MoneyBillAlt!!
        
        _MoneyBillAlt = ImageVector.Builder(
            name = "money-bill-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 144f)
                curveToRelative(-53.02f, 0f, -96f, 50.14f, -96f, 112f)
                curveToRelative(0f, 61.85f, 42.98f, 112f, 96f, 112f)
                curveToRelative(53f, 0f, 96f, -50.13f, 96f, -112f)
                curveToRelative(0f, -61.86f, -42.98f, -112f, -96f, -112f)
                close()
                moveToRelative(40f, 168f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-64f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-55.44f)
                lineToRelative(-0.47f, 0.31f)
                arcToRelative(7.992f, 7.992f, 0f, false, true, -11.09f, -2.22f)
                lineToRelative(-8.88f, -13.31f)
                arcToRelative(7.992f, 7.992f, 0f, false, true, 2.22f, -11.09f)
                lineToRelative(15.33f, -10.22f)
                arcToRelative(23.99f, 23.99f, 0f, false, true, 13.31f, -4.03f)
                horizontalLineTo(328f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveTo(608f, 64f)
                horizontalLineTo(32f)
                curveTo(14.33f, 64f, 0f, 78.33f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(576f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-16f, 272f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                horizontalLineTo(112f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                verticalLineTo(176f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                horizontalLineToRelative(416f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _MoneyBillAlt!!
    }

private var _MoneyBillAlt: ImageVector? = null

