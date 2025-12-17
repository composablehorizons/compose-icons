package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Account_balance: ImageVector
    get() {
        if (_Account_balance != null) return _Account_balance!!
        
        _Account_balance = ImageVector.Builder(
            name = "account_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, -160f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-80f)
                lineToRelative(400f, -200f)
                lineToRelative(400f, 200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(178f, -80f)
                horizontalLineToRelative(444f)
                horizontalLineToRelative(-444f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(444f)
                lineTo(480f, 130f)
                lineTo(258f, 240f)
                close()
            }
        }.build()
        
        return _Account_balance!!
    }

private var _Account_balance: ImageVector? = null

