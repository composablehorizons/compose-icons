package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MoneyBill: ImageVector
    get() {
        if (_MoneyBill != null) return _MoneyBill!!
        
        _MoneyBill = ImageVector.Builder(
            name = "money-bill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(48f, 400f)
                verticalLineToRelative(-64f)
                curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
                horizontalLineTo(48f)
                close()
                moveToRelative(0f, -224f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                curveToRelative(0f, 35.35f, -28.65f, 64f, -64f, 64f)
                close()
                moveToRelative(272f, 176f)
                curveToRelative(-44.19f, 0f, -80f, -42.99f, -80f, -96f)
                curveToRelative(0f, -53.02f, 35.82f, -96f, 80f, -96f)
                reflectiveCurveToRelative(80f, 42.98f, 80f, 96f)
                curveToRelative(0f, 53.03f, -35.83f, 96f, -80f, 96f)
                close()
                moveToRelative(272f, 48f)
                horizontalLineToRelative(-64f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(0f, -224f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _MoneyBill!!
    }

private var _MoneyBill: ImageVector? = null

