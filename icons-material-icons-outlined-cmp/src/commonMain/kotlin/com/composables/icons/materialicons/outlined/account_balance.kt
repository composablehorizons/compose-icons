package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Account_balance: ImageVector
    get() {
        if (_Account_balance != null) return _Account_balance!!
        
        _Account_balance = ImageVector.Builder(
            name = "account_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
                moveToRelative(6f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
                moveToRelative(8.5f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-2.5f, -9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
                moveToRelative(-7f, -6.74f)
                lineTo(16.71f, 6f)
                horizontalLineTo(6.29f)
                lineToRelative(5.21f, -2.74f)
                moveToRelative(0f, -2.26f)
                lineTo(2f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19f)
                verticalLineTo(6f)
                lineToRelative(-9.5f, -5f)
                close()
            }
        }.build()
        
        return _Account_balance!!
    }

private var _Account_balance: ImageVector? = null

