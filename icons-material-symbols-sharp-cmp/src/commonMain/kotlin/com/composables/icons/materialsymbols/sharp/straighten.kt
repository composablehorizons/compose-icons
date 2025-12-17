package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Straighten: ImageVector
    get() {
        if (_Straighten != null) return _Straighten!!
        
        _Straighten = ImageVector.Builder(
            name = "straighten",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(680f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(120f, -160f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-120f, 0f)
                close()
            }
        }.build()
        
        return _Straighten!!
    }

private var _Straighten: ImageVector? = null

