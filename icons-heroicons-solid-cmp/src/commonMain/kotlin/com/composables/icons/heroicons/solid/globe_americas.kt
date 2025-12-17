package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.GlobeAmericas: ImageVector
    get() {
        if (_GlobeAmericas != null) return _GlobeAmericas!!
        
        _GlobeAmericas = ImageVector.Builder(
            name = "globe-americas",
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
                moveTo(6.262f, 6.072f)
                arcToRelative(8.25f, 8.25f, 0f, true, false, 10.562f, -0.766f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.318f, 1.357f)
                lineTo(14.25f, 7.5f)
                lineToRelative(0.165f, 0.33f)
                arcToRelative(0.809f, 0.809f, 0f, false, true, -1.086f, 1.085f)
                lineToRelative(-0.604f, -0.302f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, -1.298f, 0.21f)
                lineToRelative(-0.132f, 0.131f)
                curveToRelative(-0.439f, 0.44f, -0.439f, 1.152f, 0f, 1.591f)
                lineToRelative(0.296f, 0.296f)
                curveToRelative(0.256f, 0.257f, 0.622f, 0.374f, 0.98f, 0.314f)
                lineToRelative(1.17f, -0.195f)
                curveToRelative(0.323f, -0.054f, 0.654f, 0.036f, 0.905f, 0.245f)
                lineToRelative(1.33f, 1.108f)
                curveToRelative(0.32f, 0.267f, 0.46f, 0.694f, 0.358f, 1.1f)
                arcToRelative(8.7f, 8.7f, 0f, false, true, -2.288f, 4.04f)
                lineToRelative(-0.723f, 0.724f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.298f, 0.21f)
                lineToRelative(-0.153f, -0.076f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.622f, -1.006f)
                verticalLineToRelative(-1.089f)
                curveToRelative(0f, -0.298f, -0.119f, -0.585f, -0.33f, -0.796f)
                lineToRelative(-1.347f, -1.347f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.21f, -1.298f)
                lineTo(9.75f, 12f)
                lineToRelative(-1.64f, -1.64f)
                arcToRelative(6f, 6f, 0f, false, true, -1.676f, -3.257f)
                lineToRelative(-0.172f, -1.03f)
                close()
            }
        }.build()
        
        return _GlobeAmericas!!
    }

private var _GlobeAmericas: ImageVector? = null

