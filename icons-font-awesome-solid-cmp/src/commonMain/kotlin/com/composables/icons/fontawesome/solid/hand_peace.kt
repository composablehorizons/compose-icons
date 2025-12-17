package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPeace: ImageVector
    get() {
        if (_HandPeace != null) return _HandPeace!!
        
        _HandPeace = ImageVector.Builder(
            name = "hand-peace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(408f, 216f)
                curveToRelative(-22.092f, 0f, -40f, 17.909f, -40f, 40f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -22.091f, -17.908f, -40f, -40f, -40f)
                reflectiveCurveToRelative(-40f, 17.909f, -40f, 40f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-8f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.49f, -48f, 48f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(-13.572f)
                lineTo(92.688f, 78.449f)
                curveTo(82.994f, 53.774f, 55.134f, 41.63f, 30.461f, 51.324f)
                curveTo(5.787f, 61.017f, -6.356f, 88.877f, 3.337f, 113.551f)
                lineToRelative(74.765f, 190.342f)
                lineToRelative(-31.09f, 24.872f)
                curveToRelative(-15.381f, 12.306f, -19.515f, 33.978f, -9.741f, 51.081f)
                lineToRelative(64f, 112f)
                arcTo(39.998f, 39.998f, 0f, false, false, 136f, 512f)
                horizontalLineToRelative(240f)
                curveToRelative(18.562f, 0f, 34.686f, -12.77f, 38.937f, -30.838f)
                lineToRelative(32f, -136f)
                arcTo(39.97f, 39.97f, 0f, false, false, 448f, 336f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -22.091f, -17.908f, -40f, -40f, -40f)
                close()
            }
        }.build()
        
        return _HandPeace!!
    }

private var _HandPeace: ImageVector? = null

