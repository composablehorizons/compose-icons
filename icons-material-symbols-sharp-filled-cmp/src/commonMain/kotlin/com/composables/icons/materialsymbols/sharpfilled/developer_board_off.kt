package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Developer_board_off: ImageVector
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
                moveTo(793f, 680f)
                lineTo(640f, 526f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(-86f)
                lineToRelative(-41f, -40f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(-120f)
                horizontalLineTo(480f)
                verticalLineToRelative(87f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(-46f)
                lineTo(233f, 120f)
                horizontalLineToRelative(567f)
                verticalLineToRelative(160f)
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
                close()
                moveToRelative(-553f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveTo(128f, 127f)
                lineToRelative(672f, 672f)
                verticalLineToRelative(41f)
                horizontalLineTo(80f)
                verticalLineToRelative(-713f)
                horizontalLineToRelative(48f)
                close()
                moveToRelative(352f, 352f)
                verticalLineToRelative(201f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-41f)
                lineTo(480f, 479f)
                close()
                moveTo(281f, 280f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-41f)
                lineTo(281f, 280f)
                close()
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Developer_board_off!!
    }

private var _Developer_board_off: ImageVector? = null

