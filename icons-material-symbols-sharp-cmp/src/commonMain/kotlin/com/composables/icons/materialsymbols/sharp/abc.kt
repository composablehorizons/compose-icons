package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Abc: ImageVector
    get() {
        if (_Abc != null) return _Abc!!
        
        _Abc = ImageVector.Builder(
            name = "abc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-260f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(170f)
                lineToRelative(30f, 30f)
                verticalLineToRelative(60f)
                lineToRelative(-30f, 30f)
                lineToRelative(30f, 30f)
                verticalLineToRelative(60f)
                lineToRelative(-30f, 30f)
                horizontalLineTo(380f)
                close()
                moveToRelative(60f, -150f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(0f, 90f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(-320f, 60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Abc!!
    }

private var _Abc: ImageVector? = null

