package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Docs_add_on: ImageVector
    get() {
        if (_Docs_add_on != null) return _Docs_add_on!!
        
        _Docs_add_on = ImageVector.Builder(
            name = "docs_add_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 839f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(283f)
                quadToRelative(-3f, 21f, -2.5f, 40f)
                reflectiveQuadToRelative(3.5f, 40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(386f)
                quadToRelative(-23f, 16f, -41.5f, 36f)
                reflectiveQuadTo(472f, 560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Docs_add_on!!
    }

private var _Docs_add_on: ImageVector? = null

