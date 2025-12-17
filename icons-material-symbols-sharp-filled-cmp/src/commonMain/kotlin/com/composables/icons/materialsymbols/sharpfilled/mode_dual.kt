package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mode_dual: ImageVector
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
                quadToRelative(0f, 35f, 20f, 72f)
                reflectiveQuadToRelative(65f, 85f)
                lineToRelative(-58f, 55f)
                quadToRelative(-56f, -59f, -81.5f, -109.5f)
                reflectiveQuadTo(96f, 645f)
                quadToRelative(0f, -41f, 11.5f, -85.5f)
                reflectiveQuadTo(144f, 456f)
                quadToRelative(23f, -54f, 32f, -86.5f)
                reflectiveQuadToRelative(9f, -61.5f)
                quadToRelative(0f, -33f, -21.5f, -66.5f)
                reflectiveQuadTo(94f, 163f)
                lineToRelative(54f, -59f)
                quadToRelative(60f, 55f, 88.5f, 104f)
                reflectiveQuadTo(265f, 308f)
                quadToRelative(0f, 38f, -11f, 80.5f)
                reflectiveQuadTo(219f, 487f)
                quadToRelative(-23f, 54f, -33f, 89.5f)
                reflectiveQuadTo(176f, 644f)
                close()
                moveToRelative(160f, -1f)
                quadToRelative(0f, 35f, 20f, 72.5f)
                reflectiveQuadToRelative(65f, 85.5f)
                lineToRelative(-58f, 55f)
                quadToRelative(-56f, -59f, -81.5f, -109.5f)
                reflectiveQuadTo(256f, 645f)
                quadToRelative(0f, -41f, 11.5f, -85.5f)
                reflectiveQuadTo(304f, 456f)
                quadToRelative(23f, -54f, 32f, -86.5f)
                reflectiveQuadToRelative(9f, -61.5f)
                quadToRelative(0f, -33f, -21.5f, -66.5f)
                reflectiveQuadTo(254f, 163f)
                lineToRelative(54f, -59f)
                quadToRelative(60f, 55f, 88.5f, 104f)
                reflectiveQuadTo(425f, 308f)
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

