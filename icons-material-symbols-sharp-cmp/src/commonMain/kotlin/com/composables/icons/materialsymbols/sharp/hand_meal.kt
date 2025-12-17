package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hand_meal: ImageVector
    get() {
        if (_Hand_meal != null) return _Hand_meal!!
        
        _Hand_meal = ImageVector.Builder(
            name = "hand_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(81f)
                quadToRelative(14f, -127f, 103f, -216f)
                reflectiveQuadToRelative(216f, -103f)
                verticalLineToRelative(-41f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(41f)
                quadToRelative(127f, 14f, 216f, 103f)
                reflectiveQuadToRelative(103f, 216f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(163f, -80f)
                horizontalLineToRelative(554f)
                quadToRelative(-14f, -103f, -92.5f, -171.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-106f, 0f, -184.5f, 68.5f)
                reflectiveQuadTo(203f, 440f)
                close()
                moveToRelative(277f, 0f)
                close()
                moveToRelative(95f, 80f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(264f)
                lineToRelative(200f, -165f)
                quadToRelative(-8f, -8f, -18f, -12f)
                reflectiveQuadToRelative(-21f, -6f)
                quadToRelative(-17f, -3f, -33f, 1f)
                reflectiveQuadToRelative(-30f, 15f)
                lineToRelative(-108f, 87f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(146f)
                lineToRelative(44f, -36f)
                quadToRelative(5f, -3f, 7.5f, -8f)
                reflectiveQuadToRelative(2.5f, -11f)
                quadToRelative(0f, -10f, -7.5f, -17.5f)
                reflectiveQuadTo(575f, 520f)
                close()
                moveToRelative(-335f, 0f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                close()
                moveToRelative(69f, 360f)
                horizontalLineTo(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(495f)
                quadToRelative(85f, 0f, 164f, 29f)
                reflectiveQuadToRelative(127f, 98f)
                lineToRelative(27f, 41f)
                lineToRelative(-278f, 232f)
                horizontalLineTo(309f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Hand_meal!!
    }

private var _Hand_meal: ImageVector? = null

