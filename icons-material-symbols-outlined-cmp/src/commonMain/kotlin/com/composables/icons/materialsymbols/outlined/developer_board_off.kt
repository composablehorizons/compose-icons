package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Developer_board_off: ImageVector
    get() {
        if (_Developer_board_off != null) return _Developer_board_off!!
        
        _Developer_board_off = ImageVector.Builder(
            name = "developer_board_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(233f, 120f)
                horizontalLineToRelative(487f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-87f)
                lineToRelative(-73f, -73f)
                verticalLineToRelative(-407f)
                horizontalLineTo(313f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(207f, 207f)
                lineToRelative(-47f, -47f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(73f, 73f)
                lineToRelative(-33f, -33f)
                verticalLineToRelative(-87f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(513f)
                close()
                moveToRelative(127f, 126f)
                lineToRelative(-86f, -86f)
                horizontalLineToRelative(86f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(-233f, -6f)
                close()
                moveToRelative(110f, -118f)
                close()
                moveTo(240f, 680f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(240f)
                close()
                moveTo(128f, 127f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-41f)
                lineToRelative(80f, 80f)
                quadToRelative(-14f, 20f, -35f, 30.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -25f, 13.5f, -44.5f)
                reflectiveQuadTo(128f, 127f)
                close()
                moveToRelative(352f, 352f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(41f)
                horizontalLineTo(480f)
                verticalLineToRelative(-201f)
                close()
                moveTo(281f, 280f)
                lineToRelative(159f, 159f)
                verticalLineToRelative(41f)
                horizontalLineTo(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(41f)
                close()
            }
        }.build()
        
        return _Developer_board_off!!
    }

private var _Developer_board_off: ImageVector? = null

