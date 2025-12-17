package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pinboard_unread: ImageVector
    get() {
        if (_Pinboard_unread != null) return _Pinboard_unread!!
        
        _Pinboard_unread = ImageVector.Builder(
            name = "pinboard_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 880f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                lineToRelative(60f, -106f)
                verticalLineToRelative(-94f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(94f)
                lineToRelative(60f, 106f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                lineToRelative(-40f, 40f)
                close()
                moveToRelative(460f, -560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-196f, -80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(444f)
                quadToRelative(-2f, 10f, -3f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                quadToRelative(0f, 11f, 1f, 20.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                close()
                moveToRelative(-44f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-337f)
                quadToRelative(24f, -11f, 44f, -27f)
                reflectiveQuadToRelative(36f, -36f)
                verticalLineToRelative(480f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Pinboard_unread!!
    }

private var _Pinboard_unread: ImageVector? = null

