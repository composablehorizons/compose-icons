package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Schema: ImageVector
    get() {
        if (_Schema != null) return _Schema!!
        
        _Schema = ImageVector.Builder(
            name = "schema",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(60f, -40f)
                close()
                moveToRelative(0f, 320f)
                close()
                moveToRelative(400f, 0f)
                close()
                moveTo(300f, 800f)
                close()
            }
        }.build()
        
        return _Schema!!
    }

private var _Schema: ImageVector? = null

