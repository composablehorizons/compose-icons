package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pulmonology: ImageVector
    get() {
        if (_Pulmonology != null) return _Pulmonology!!
        
        _Pulmonology = ImageVector.Builder(
            name = "pulmonology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-167f)
                lineToRelative(105f, -281f)
                quadToRelative(12f, -33f, 42f, -52.5f)
                reflectiveQuadToRelative(65f, -19.5f)
                quadToRelative(45f, 0f, 76.5f, 32.5f)
                reflectiveQuadTo(400f, 311f)
                verticalLineToRelative(49f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-49f)
                quadToRelative(0f, -13f, -9f, -22f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-10f, 0f, -18.5f, 5.5f)
                reflectiveQuadTo(260f, 300f)
                lineTo(160f, 568f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(559f, 0f)
                horizontalLineTo(639f)
                quadToRelative(-50f, 0f, -85f, -34.5f)
                reflectiveQuadTo(519f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(639f, 760f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(799f, 720f)
                verticalLineToRelative(-152f)
                lineTo(699f, 300f)
                quadToRelative(-4f, -9f, -12f, -14.5f)
                reflectiveQuadToRelative(-18f, -5.5f)
                quadToRelative(-13f, 0f, -21.5f, 9f)
                reflectiveQuadToRelative(-8.5f, 22f)
                verticalLineToRelative(49f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-49f)
                quadToRelative(0f, -46f, 31.5f, -78.5f)
                reflectiveQuadTo(667f, 200f)
                quadToRelative(35f, 0f, 64.5f, 19.5f)
                reflectiveQuadTo(774f, 272f)
                lineToRelative(105f, 281f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(759f, 840f)
                close()
                moveTo(320f, 504f)
                close()
                moveToRelative(319f, 0f)
                close()
                moveToRelative(-159f, -47f)
                lineTo(376f, 560f)
                lineToRelative(-56f, -56f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(304f)
                lineToRelative(120f, 120f)
                lineToRelative(-57f, 56f)
                lineToRelative(-103f, -103f)
                close()
            }
        }.build()
        
        return _Pulmonology!!
    }

private var _Pulmonology: ImageVector? = null

