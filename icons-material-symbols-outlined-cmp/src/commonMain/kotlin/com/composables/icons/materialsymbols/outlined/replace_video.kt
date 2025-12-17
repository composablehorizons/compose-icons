package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Replace_video: ImageVector
    get() {
        if (_Replace_video != null) return _Replace_video!!
        
        _Replace_video = ImageVector.Builder(
            name = "replace_video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(280f)
                verticalLineToRelative(320f)
                close()
                moveTo(140f, 320f)
                quadToRelative(38f, -109f, 131.5f, -174.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 214f)
                verticalLineToRelative(-134f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(76f)
                quadToRelative(-39f, -39f, -90f, -59.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-81f, 0f, -149.5f, 43f)
                reflectiveQuadTo(227f, 320f)
                horizontalLineToRelative(-87f)
                close()
                moveToRelative(140f, 480f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(120f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(320f)
                lineTo(680f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Replace_video!!
    }

private var _Replace_video: ImageVector? = null

