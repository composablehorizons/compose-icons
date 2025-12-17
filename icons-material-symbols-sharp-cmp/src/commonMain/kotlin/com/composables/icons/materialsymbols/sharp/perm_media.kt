package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Perm_media: ImageVector
    get() {
        if (_Perm_media != null) return _Perm_media!!
        
        _Perm_media = ImageVector.Builder(
            name = "perm_media",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(280f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(520f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(527f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                lineTo(622f, 340f)
                lineToRelative(-92f, 120f)
                lineToRelative(-62f, -80f)
                lineToRelative(-108f, 140f)
                close()
            }
        }.build()
        
        return _Perm_media!!
    }

private var _Perm_media: ImageVector? = null

