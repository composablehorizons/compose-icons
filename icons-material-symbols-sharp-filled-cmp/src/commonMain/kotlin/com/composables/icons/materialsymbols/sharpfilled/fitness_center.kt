package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fitness_center: ImageVector
    get() {
        if (_Fitness_center != null) return _Fitness_center!!
        
        _Fitness_center = ImageVector.Builder(
            name = "fitness_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(536f, 876f)
                lineToRelative(-56f, -56f)
                lineToRelative(142f, -142f)
                lineToRelative(-340f, -340f)
                lineToRelative(-142f, 142f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, -58f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-56f, -58f)
                lineToRelative(56f, -56f)
                lineToRelative(58f, 56f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(58f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-142f, 142f)
                lineToRelative(340f, 340f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 84f)
                lineToRelative(56f, 58f)
                lineToRelative(-56f, 56f)
                lineToRelative(-58f, -56f)
                lineToRelative(-84f, 84f)
                lineToRelative(-56f, -56f)
                lineToRelative(-58f, 56f)
                close()
            }
        }.build()
        
        return _Fitness_center!!
    }

private var _Fitness_center: ImageVector? = null

