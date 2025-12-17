package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Quickreply: ImageVector
    get() {
        if (_Quickreply != null) return _Quickreply!!
        
        _Quickreply = ImageVector.Builder(
            name = "quickreply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 720f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 680f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 480f)
                horizontalLineToRelative(115f)
                quadToRelative(16f, 0f, 24.5f, 13.5f)
                reflectiveQuadTo(862f, 522f)
                lineToRelative(-50f, 118f)
                horizontalLineToRelative(39f)
                quadToRelative(17f, 0f, 26f, 14f)
                reflectiveQuadToRelative(1f, 29f)
                lineTo(779f, 882f)
                quadToRelative(-4f, 7f, -11.5f, 5.5f)
                reflectiveQuadTo(760f, 878f)
                verticalLineToRelative(-158f)
                close()
                moveToRelative(-520f, 0f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 400f)
                horizontalLineTo(680f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 480f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Quickreply!!
    }

private var _Quickreply: ImageVector? = null

