package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Remove_road: ImageVector
    get() {
        if (_Remove_road != null) return _Remove_road!!
        
        _Remove_road = ImageVector.Builder(
            name = "remove_road",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(280f, -480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(177f, 23f)
                lineToRelative(85f, -85f)
                lineToRelative(-85f, -84f)
                lineToRelative(57f, -57f)
                lineToRelative(85f, 85f)
                lineToRelative(85f, -85f)
                lineToRelative(56f, 57f)
                lineToRelative(-85f, 85f)
                lineToRelative(84f, 85f)
                lineToRelative(-55f, 56f)
                lineToRelative(-86f, -85f)
                lineToRelative(-85f, 85f)
                lineToRelative(-56f, -57f)
                close()
            }
        }.build()
        
        return _Remove_road!!
    }

private var _Remove_road: ImageVector? = null

