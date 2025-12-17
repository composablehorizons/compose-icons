package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.GlobeAsiaAustralia: ImageVector
    get() {
        if (_GlobeAsiaAustralia != null) return _GlobeAsiaAustralia!!
        
        _GlobeAsiaAustralia = ImageVector.Builder(
            name = "globe-asia-australia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12.75f, 3.03f)
                verticalLineToRelative(0.568f)
                curveToRelative(0f, 0.334f, 0.148f, 0.65f, 0.405f, 0.864f)
                lineToRelative(1.068f, 0.89f)
                curveToRelative(0.442f, 0.369f, 0.535f, 1.01f, 0.216f, 1.49f)
                lineToRelative(-0.51f, 0.766f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.161f, 0.886f)
                lineToRelative(-0.143f, 0.048f)
                arcToRelative(1.107f, 1.107f, 0f, false, false, -0.57f, 1.664f)
                curveToRelative(0.369f, 0.555f, 0.169f, 1.307f, -0.427f, 1.605f)
                lineTo(9f, 13.125f)
                lineToRelative(0.423f, 1.059f)
                arcToRelative(0.956f, 0.956f, 0f, false, true, -1.652f, 0.928f)
                lineToRelative(-0.679f, -0.906f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, -1.906f, 0.172f)
                lineTo(4.5f, 15.75f)
                lineToRelative(-0.612f, 0.153f)
                moveTo(12.75f, 3.031f)
                arcToRelative(9f, 9f, 0f, false, false, -8.862f, 12.872f)
                moveTo(12.75f, 3.031f)
                arcToRelative(9f, 9f, 0f, false, true, 6.69f, 14.036f)
                moveToRelative(0f, 0f)
                lineToRelative(-0.177f, -0.529f)
                arcTo(2.25f, 2.25f, 0f, false, false, 17.128f, 15f)
                horizontalLineTo(16.5f)
                lineToRelative(-0.324f, -0.324f)
                arcToRelative(1.453f, 1.453f, 0f, false, false, -2.328f, 0.377f)
                lineToRelative(-0.036f, 0.073f)
                arcToRelative(1.586f, 1.586f, 0f, false, true, -0.982f, 0.816f)
                lineToRelative(-0.99f, 0.282f)
                curveToRelative(-0.55f, 0.157f, -0.894f, 0.702f, -0.8f, 1.267f)
                lineToRelative(0.073f, 0.438f)
                curveToRelative(0.08f, 0.474f, 0.49f, 0.821f, 0.97f, 0.821f)
                curveToRelative(0.846f, 0f, 1.598f, 0.542f, 1.865f, 1.345f)
                lineToRelative(0.215f, 0.643f)
                moveToRelative(5.276f, -3.67f)
                arcToRelative(9.012f, 9.012f, 0f, false, true, -5.276f, 3.67f)
                moveToRelative(0f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, -10.275f, -4.835f)
                moveTo(15.75f, 9f)
                curveToRelative(0f, 0.896f, -0.393f, 1.7f, -1.016f, 2.25f)
            }
        }.build()
        
        return _GlobeAsiaAustralia!!
    }

private var _GlobeAsiaAustralia: ImageVector? = null

