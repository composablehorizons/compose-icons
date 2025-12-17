package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cabin: ImageVector
    get() {
        if (_Cabin != null) return _Cabin!!
        
        _Cabin = ImageVector.Builder(
            name = "cabin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-36f)
                lineToRelative(-58f, -44f)
                horizontalLineTo(298f)
                lineToRelative(-58f, 44f)
                verticalLineToRelative(36f)
                close()
                moveToRelative(162f, -160f)
                horizontalLineToRelative(156f)
                lineToRelative(-78f, -59f)
                lineToRelative(-78f, 59f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-48f, -64f)
                lineToRelative(120f, -92f)
                verticalLineToRelative(-124f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(63f)
                lineToRelative(240f, -183f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 63f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(375f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Cabin!!
    }

private var _Cabin: ImageVector? = null

