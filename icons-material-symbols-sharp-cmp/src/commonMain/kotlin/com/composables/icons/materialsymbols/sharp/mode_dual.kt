package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mode_dual: ImageVector
    get() {
        if (_Mode_dual != null) return _Mode_dual!!
        
        _Mode_dual = ImageVector.Builder(
            name = "mode_dual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 644f)
                quadToRelative(0f, 39f, 20f, 75.5f)
                reflectiveQuadToRelative(65f, 81.5f)
                lineToRelative(-58f, 55f)
                quadToRelative(-57f, -56f, -82f, -106f)
                reflectiveQuadTo(96f, 645f)
                quadToRelative(0f, -41f, 11.5f, -85.5f)
                reflectiveQuadTo(144f, 456f)
                quadToRelative(23f, -54f, 32f, -86.5f)
                reflectiveQuadToRelative(9f, -61.5f)
                quadToRelative(0f, -36f, -21.5f, -69.5f)
                reflectiveQuadTo(94f, 163f)
                lineToRelative(54f, -59f)
                quadToRelative(61f, 52f, 89f, 101f)
                reflectiveQuadToRelative(28f, 103f)
                quadToRelative(0f, 38f, -11f, 80.5f)
                reflectiveQuadTo(219f, 487f)
                quadToRelative(-23f, 54f, -33f, 89.5f)
                reflectiveQuadTo(176f, 644f)
                close()
                moveToRelative(160f, -1f)
                quadToRelative(0f, 39f, 20f, 76f)
                reflectiveQuadToRelative(65f, 82f)
                lineToRelative(-58f, 55f)
                quadToRelative(-57f, -56f, -82f, -106f)
                reflectiveQuadToRelative(-25f, -105f)
                quadToRelative(0f, -41f, 11.5f, -85.5f)
                reflectiveQuadTo(304f, 456f)
                quadToRelative(23f, -54f, 32f, -86.5f)
                reflectiveQuadToRelative(9f, -61.5f)
                quadToRelative(0f, -36f, -21.5f, -69.5f)
                reflectiveQuadTo(254f, 163f)
                lineToRelative(54f, -59f)
                quadToRelative(61f, 52f, 89f, 101f)
                reflectiveQuadToRelative(28f, 103f)
                quadToRelative(0f, 38f, -11f, 80f)
                reflectiveQuadToRelative(-35f, 98f)
                quadToRelative(-23f, 54f, -33f, 89.5f)
                reflectiveQuadTo(336f, 643f)
                close()
                moveTo(480f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(130f, -129f)
                lineToRelative(56f, 57f)
                lineToRelative(-186f, 186f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(186f, -186f)
                lineToRelative(56f, 56f)
                lineToRelative(-128f, 130f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(80f)
                horizontalLineTo(754f)
                lineToRelative(129f, 129f)
                lineToRelative(-57f, 57f)
                lineToRelative(-186f, -186f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                lineToRelative(186f, 186f)
                lineToRelative(-56f, 56f)
                lineToRelative(-130f, -128f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mode_dual!!
    }

private var _Mode_dual: ImageVector? = null

