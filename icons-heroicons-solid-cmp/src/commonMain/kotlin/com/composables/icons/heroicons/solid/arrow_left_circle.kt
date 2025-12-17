package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowLeftCircle: ImageVector
    get() {
        if (_ArrowLeftCircle != null) return _ArrowLeftCircle!!
        
        _ArrowLeftCircle = ImageVector.Builder(
            name = "arrow-left-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveToRelative(-4.28f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.72f, -1.72f)
                horizontalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-5.69f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3f, 3f)
                close()
            }
        }.build()
        
        return _ArrowLeftCircle!!
    }

private var _ArrowLeftCircle: ImageVector? = null

