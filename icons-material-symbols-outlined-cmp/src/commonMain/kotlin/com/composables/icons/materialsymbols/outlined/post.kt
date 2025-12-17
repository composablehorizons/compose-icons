package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Post: ImageVector
    get() {
        if (_Post != null) return _Post!!
        
        _Post = ImageVector.Builder(
            name = "post",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(600f, -160f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-480f, -60f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -140f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 200f)
                verticalLineToRelative(60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -140f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Post!!
    }

private var _Post: ImageVector? = null

