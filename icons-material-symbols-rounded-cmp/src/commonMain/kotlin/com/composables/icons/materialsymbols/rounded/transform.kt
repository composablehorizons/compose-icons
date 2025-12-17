package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Transform: ImageVector
    get() {
        if (_Transform != null) return _Transform!!
        
        _Transform = ImageVector.Builder(
            name = "transform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-86f)
                lineToRelative(-35f, 35f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(188f, 228f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(452f, 228f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(395f, 229f)
                lineToRelative(-35f, -35f)
                verticalLineToRelative(406f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(680f)
                verticalLineToRelative(86f)
                lineToRelative(35f, -35f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(772f, 732f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(772f, 788f)
                lineTo(668f, 892f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(508f, 788f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(565f, 731f)
                lineToRelative(35f, 35f)
                verticalLineToRelative(-86f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(320f, 160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Transform!!
    }

private var _Transform: ImageVector? = null

