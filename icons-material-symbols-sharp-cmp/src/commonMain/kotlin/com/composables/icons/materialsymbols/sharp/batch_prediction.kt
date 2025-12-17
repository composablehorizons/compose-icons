package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Batch_prediction: ImageVector
    get() {
        if (_Batch_prediction != null) return _Batch_prediction!!
        
        _Batch_prediction = ImageVector.Builder(
            name = "batch_prediction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -23f, 15.5f, -46f)
                reflectiveQuadToRelative(34.5f, -47f)
                quadToRelative(19f, -25f, 34.5f, -51f)
                reflectiveQuadToRelative(15.5f, -56f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 30f, 15.5f, 56f)
                reflectiveQuadToRelative(34.5f, 51f)
                quadToRelative(19f, 24f, 34.5f, 47f)
                reflectiveQuadToRelative(15.5f, 46f)
                close()
                moveTo(240f, 260f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(60f)
                horizontalLineTo(240f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(60f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Batch_prediction!!
    }

private var _Batch_prediction: ImageVector? = null

