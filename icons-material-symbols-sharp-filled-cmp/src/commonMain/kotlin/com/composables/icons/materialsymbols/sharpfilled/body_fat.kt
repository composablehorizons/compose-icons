package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Body_fat: ImageVector
    get() {
        if (_Body_fat != null) return _Body_fat!!
        
        _Body_fat = ImageVector.Builder(
            name = "body_fat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 640f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(248f)
                lineTo(-20f, 481f)
                lineToRelative(820f, -409f)
                verticalLineToRelative(248f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-117f)
                lineToRelative(-176f, 87f)
                quadToRelative(27f, 43f, 41.5f, 91f)
                reflectiveQuadToRelative(14.5f, 99f)
                quadToRelative(0f, 51f, -14.5f, 100f)
                reflectiveQuadTo(543f, 672f)
                lineToRelative(176f, 87f)
                verticalLineToRelative(-119f)
                horizontalLineToRelative(-39f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-370f, -5f)
                quadToRelative(24f, -34f, 37f, -73.5f)
                reflectiveQuadToRelative(13f, -81.5f)
                quadToRelative(0f, -42f, -13f, -80.5f)
                reflectiveQuadTo(471f, 326f)
                lineTo(160f, 480f)
                lineToRelative(310f, 155f)
                close()
            }
        }.build()
        
        return _Body_fat!!
    }

private var _Body_fat: ImageVector? = null

