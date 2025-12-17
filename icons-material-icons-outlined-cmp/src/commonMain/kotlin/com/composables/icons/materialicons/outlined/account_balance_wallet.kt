package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Account_balance_wallet: ImageVector
    get() {
        if (_Account_balance_wallet != null) return _Account_balance_wallet!!
        
        _Account_balance_wallet = ImageVector.Builder(
            name = "account_balance_wallet",
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
                moveTo(21f, 7.28f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.28f)
                curveToRelative(0.59f, -0.35f, 1f, -0.98f, 1f, -1.72f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.74f, -0.41f, -1.37f, -1f, -1.72f)
                close()
                moveTo(20f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                verticalLineTo(9f)
                horizontalLineToRelative(7f)
                close()
                moveTo(5f, 19f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17.5f, 12f)
                close()
            }
        }.build()
        
        return _Account_balance_wallet!!
    }

private var _Account_balance_wallet: ImageVector? = null

