package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Barcode: ImageVector
    get() {
        if (_Barcode != null) return _Barcode!!
        
        _Barcode = ImageVector.Builder(
            name = "barcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(520f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(800f)
                close()
            }
        }.build()
        
        return _Barcode!!
    }

private var _Barcode: ImageVector? = null

