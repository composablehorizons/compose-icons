package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fan_indirect: ImageVector
    get() {
        if (_Fan_indirect != null) return _Fan_indirect!!
        
        _Fan_indirect = ImageVector.Builder(
            name = "fan_indirect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(340f, 740f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 43f)
                verticalLineToRelative(-247f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                lineToRelative(43f, -43f)
                lineToRelative(57f, 56f)
                lineTo(480f, 880f)
                close()
                moveTo(180f, 760f)
                lineTo(40f, 620f)
                lineToRelative(140f, -140f)
                lineToRelative(56f, 57f)
                lineToRelative(-43f, 43f)
                horizontalLineToRelative(87f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 660f)
                horizontalLineToRelative(-87f)
                lineToRelative(43f, 44f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(600f, 0f)
                lineToRelative(-57f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineToRelative(-87f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 580f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(87f)
                lineToRelative(-44f, -43f)
                lineToRelative(57f, -57f)
                lineToRelative(140f, 140f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(80f, 468f)
                verticalLineToRelative(-268f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(268f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-188f)
                horizontalLineTo(160f)
                verticalLineToRelative(188f)
                lineToRelative(-80f, 80f)
                close()
            }
        }.build()
        
        return _Fan_indirect!!
    }

private var _Fan_indirect: ImageVector? = null

