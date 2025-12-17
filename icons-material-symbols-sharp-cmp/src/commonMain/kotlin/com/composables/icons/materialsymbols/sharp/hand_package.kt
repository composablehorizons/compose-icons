package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hand_package: ImageVector
    get() {
        if (_Hand_package != null) return _Hand_package!!
        
        _Hand_package = ImageVector.Builder(
            name = "hand_package",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 160f)
                horizontalLineTo(360f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineTo(680f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-280f)
                close()
                moveTo(575f, 520f)
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
                moveToRelative(40f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(440f)
                horizontalLineTo(280f)
                close()
                moveToRelative(29f, 360f)
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
        
        return _Hand_package!!
    }

private var _Hand_package: ImageVector? = null

