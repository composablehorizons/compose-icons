package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Magic_exchange: ImageVector
    get() {
        if (_Magic_exchange != null) return _Magic_exchange!!
        
        _Magic_exchange = ImageVector.Builder(
            name = "magic_exchange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 1016f)
                quadToRelative(-112f, 0f, -206f, -51f)
                reflectiveQuadTo(120f, 829f)
                verticalLineToRelative(107f)
                horizontalLineTo(40f)
                verticalLineTo(696f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-99f)
                quadToRelative(48f, 72f, 126.5f, 116f)
                reflectiveQuadTo(480f, 936f)
                quadToRelative(75f, 0f, 140.5f, -28.5f)
                reflectiveQuadToRelative(114f, -77f)
                quadToRelative(48.5f, -48.5f, 77f, -114f)
                reflectiveQuadTo(840f, 576f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 91f, -34.5f, 171f)
                reflectiveQuadTo(791f, 887f)
                quadToRelative(-60f, 60f, -140f, 94.5f)
                reflectiveQuadTo(480f, 1016f)
                close()
                moveTo(40f, 576f)
                quadToRelative(0f, -91f, 34.5f, -171f)
                reflectiveQuadTo(169f, 265f)
                quadToRelative(60f, -60f, 140f, -94.5f)
                reflectiveQuadTo(480f, 136f)
                quadToRelative(112f, 0f, 206f, 51f)
                reflectiveQuadToRelative(154f, 136f)
                verticalLineTo(216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(99f)
                quadToRelative(-48f, -72f, -126.5f, -116f)
                reflectiveQuadTo(480f, 216f)
                quadToRelative(-75f, 0f, -140.5f, 28.5f)
                reflectiveQuadToRelative(-114f, 77f)
                quadToRelative(-48.5f, 48.5f, -77f, 114f)
                reflectiveQuadTo(120f, 576f)
                horizontalLineTo(40f)
                close()
                moveToRelative(440f, 200f)
                lineToRelative(-62f, -138f)
                lineToRelative(-138f, -62f)
                lineToRelative(138f, -63f)
                lineToRelative(62f, -137f)
                lineToRelative(63f, 137f)
                lineToRelative(137f, 63f)
                lineToRelative(-137f, 62f)
                lineToRelative(-63f, 138f)
                close()
            }
        }.build()
        
        return _Magic_exchange!!
    }

private var _Magic_exchange: ImageVector? = null

