package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) return _CreditCard!!
        
        _CreditCard = ImageVector.Builder(
            name = "credit-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 10f)
                verticalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(20f)
                close()
                moveToRelative(-14.99f, 4f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, true, false, 0.01f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
                moveToRelative(5.99f, 0f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
                moveToRelative(5f, -10f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                horizontalLineToRelative(-20f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _CreditCard!!
    }

private var _CreditCard: ImageVector? = null

