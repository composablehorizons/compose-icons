package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dynamic_form: ImageVector
    get() {
        if (_Dynamic_form != null) return _Dynamic_form!!
        
        _Dynamic_form = ImageVector.Builder(
            name = "dynamic_form",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(520f, 80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                lineToRelative(-80f, 200f)
                horizontalLineToRelative(80f)
                lineTo(680f, 800f)
                close()
                moveTo(190f, 690f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -360f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(-30f, 30f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 360f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Dynamic_form!!
    }

private var _Dynamic_form: ImageVector? = null

