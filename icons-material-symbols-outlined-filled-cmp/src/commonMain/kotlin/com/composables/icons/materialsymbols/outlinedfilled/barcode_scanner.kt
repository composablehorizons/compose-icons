package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Barcode_scanner: ImageVector
    get() {
        if (_Barcode_scanner != null) return _Barcode_scanner!!
        
        _Barcode_scanner = ImageVector.Builder(
            name = "barcode_scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(680f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(720f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(480f)
                horizontalLineTo(520f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(40f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(40f)
                close()
                moveToRelative(800f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Barcode_scanner!!
    }

private var _Barcode_scanner: ImageVector? = null

