package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Do_not_disturb_off: ImageVector
    get() {
        if (_Do_not_disturb_off != null) return _Do_not_disturb_off!!
        
        _Do_not_disturb_off = ImageVector.Builder(
            name = "do_not_disturb_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(635f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(125f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-45f)
                close()
                moveToRelative(-228f, -80f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(127f)
                close()
                moveTo(819f, 932f)
                lineTo(701f, 814f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 800f)
                quadToRelative(45f, 0f, 85.5f, -12f)
                reflectiveQuadToRelative(76.5f, -33f)
                lineTo(205f, 318f)
                quadToRelative(-21f, 36f, -33f, 76.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(335f, -100f)
                lineToRelative(-59f, -59f)
                quadToRelative(21f, -35f, 32.5f, -75.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-45f, 0f, -85.5f, 11.5f)
                reflectiveQuadTo(319f, 204f)
                lineToRelative(-59f, -59f)
                quadToRelative(48f, -31f, 103.5f, -48f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 61f, -17f, 116.5f)
                reflectiveQuadTo(815f, 700f)
                close()
                moveTo(538f, 422f)
                close()
                moveTo(424f, 536f)
                close()
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

