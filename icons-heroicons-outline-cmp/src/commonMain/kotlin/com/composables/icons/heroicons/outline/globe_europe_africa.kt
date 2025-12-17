package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.GlobeEuropeAfrica: ImageVector
    get() {
        if (_GlobeEuropeAfrica != null) return _GlobeEuropeAfrica!!
        
        _GlobeEuropeAfrica = ImageVector.Builder(
            name = "globe-europe-africa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(20.893f, 13.393f)
                lineToRelative(-1.135f, -1.135f)
                arcToRelative(2.252f, 2.252f, 0f, false, true, -0.421f, -0.585f)
                lineToRelative(-1.08f, -2.16f)
                arcToRelative(0.414f, 0.414f, 0f, false, false, -0.663f, -0.107f)
                arcToRelative(0.827f, 0.827f, 0f, false, true, -0.812f, 0.21f)
                lineToRelative(-1.273f, -0.363f)
                arcToRelative(0.89f, 0.89f, 0f, false, false, -0.738f, 1.595f)
                lineToRelative(0.587f, 0.39f)
                curveToRelative(0.59f, 0.395f, 0.674f, 1.23f, 0.172f, 1.732f)
                lineToRelative(-0.2f, 0.2f)
                curveToRelative(-0.212f, 0.212f, -0.33f, 0.498f, -0.33f, 0.796f)
                verticalLineToRelative(0.41f)
                curveToRelative(0f, 0.409f, -0.11f, 0.809f, -0.32f, 1.158f)
                lineToRelative(-1.315f, 2.191f)
                arcToRelative(2.11f, 2.11f, 0f, false, true, -1.81f, 1.025f)
                arcToRelative(1.055f, 1.055f, 0f, false, true, -1.055f, -1.055f)
                verticalLineToRelative(-1.172f)
                curveToRelative(0f, -0.92f, -0.56f, -1.747f, -1.414f, -2.089f)
                lineToRelative(-0.655f, -0.261f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.383f, -2.46f)
                lineToRelative(0.007f, -0.042f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 0.29f, -0.787f)
                lineToRelative(0.09f, -0.15f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.37f, -1.048f)
                lineToRelative(1.178f, 0.236f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 1.302f, -0.795f)
                lineToRelative(0.208f, -0.73f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, -0.578f, -1.315f)
                lineToRelative(-0.665f, -0.332f)
                lineToRelative(-0.091f, 0.091f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.591f, 0.659f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-0.249f, 0f, -0.487f, 0.1f, -0.662f, 0.274f)
                arcToRelative(0.931f, 0.931f, 0f, false, true, -1.458f, -1.137f)
                lineToRelative(1.411f, -2.353f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0.286f, -0.76f)
                moveToRelative(11.928f, 9.869f)
                arcTo(9f, 9f, 0f, false, false, 8.965f, 3.525f)
                moveToRelative(11.928f, 9.868f)
                arcTo(9f, 9f, 0f, true, true, 8.965f, 3.525f)
            }
        }.build()
        
        return _GlobeEuropeAfrica!!
    }

private var _GlobeEuropeAfrica: ImageVector? = null

