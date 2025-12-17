package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Severe_cold: ImageVector
    get() {
        if (_Severe_cold != null) return _Severe_cold!!
        
        _Severe_cold = ImageVector.Builder(
            name = "severe_cold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 400f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-144f)
                lineTo(296f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-64f)
                lineTo(176f, 720f)
                lineToRelative(-56f, -56f)
                lineToRelative(104f, -104f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineTo(120f, 376f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-64f)
                lineTo(240f, 256f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                verticalLineToRelative(-144f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(144f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(656f)
                lineToRelative(104f, 104f)
                lineToRelative(-56f, 56f)
                lineToRelative(-160f, -160f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(64f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, -600f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Severe_cold!!
    }

private var _Severe_cold: ImageVector? = null

