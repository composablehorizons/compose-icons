package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_encryption: ImageVector
    get() {
        if (_No_encryption != null) return _No_encryption!!
        
        _No_encryption = ImageVector.Builder(
            name = "no_encryption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 686f)
                lineTo(434f, 320f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -34.5f, -85f)
                reflectiveQuadTo(481f, 120f)
                quadToRelative(-50f, 0f, -84f, 34.5f)
                reflectiveQuadTo(363f, 240f)
                verticalLineToRelative(9f)
                lineToRelative(-73f, -73f)
                quadToRelative(22f, -61f, 75f, -98.5f)
                reflectiveQuadTo(481f, 40f)
                quadToRelative(83f, 0f, 141f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(366f)
                close()
                moveToRelative(20f, 246f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(160f)
                verticalLineToRelative(-556f)
                horizontalLineToRelative(52f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(424f, 538f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 31.5f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(481f, 675f)
                quadToRelative(17f, 0f, 31.5f, -6f)
                reflectiveQuadToRelative(25.5f, -17f)
                lineTo(424f, 538f)
                close()
            }
        }.build()
        
        return _No_encryption!!
    }

private var _No_encryption: ImageVector? = null

