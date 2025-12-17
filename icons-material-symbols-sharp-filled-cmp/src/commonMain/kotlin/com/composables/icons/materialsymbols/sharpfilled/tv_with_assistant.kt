package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tv_with_assistant: ImageVector
    get() {
        if (_Tv_with_assistant != null) return _Tv_with_assistant!!
        
        _Tv_with_assistant = ImageVector.Builder(
            name = "tv_with_assistant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 500f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 500f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 500f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(340f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(300f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(260f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(300f, 500f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(700f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(660f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(620f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(660f, 500f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, -80f)
                horizontalLineTo(227f)
                lineToRelative(-27f, 80f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Tv_with_assistant!!
    }

private var _Tv_with_assistant: ImageVector? = null

