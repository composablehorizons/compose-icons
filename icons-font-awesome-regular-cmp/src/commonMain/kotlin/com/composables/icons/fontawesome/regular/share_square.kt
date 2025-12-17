package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.ShareSquare: ImageVector
    get() {
        if (_ShareSquare != null) return _ShareSquare!!
        
        _ShareSquare = ImageVector.Builder(
            name = "share-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(561.938f, 158.06f)
                lineTo(417.94f, 14.092f)
                curveTo(387.926f, -15.922f, 336f, 5.097f, 336f, 48.032f)
                verticalLineToRelative(57.198f)
                curveToRelative(-42.45f, 1.88f, -84.03f, 6.55f, -120.76f, 17.99f)
                curveToRelative(-35.17f, 10.95f, -63.07f, 27.58f, -82.91f, 49.42f)
                curveTo(108.22f, 199.2f, 96f, 232.6f, 96f, 271.94f)
                curveToRelative(0f, 61.697f, 33.178f, 112.455f, 84.87f, 144.76f)
                curveToRelative(37.546f, 23.508f, 85.248f, -12.651f, 71.02f, -55.74f)
                curveToRelative(-15.515f, -47.119f, -17.156f, -70.923f, 84.11f, -78.76f)
                verticalLineTo(336f)
                curveToRelative(0f, 42.993f, 51.968f, 63.913f, 81.94f, 33.94f)
                lineToRelative(143.998f, -144f)
                curveToRelative(18.75f, -18.74f, 18.75f, -49.14f, 0f, -67.88f)
                close()
                moveTo(384f, 336f)
                verticalLineTo(232.16f)
                curveTo(255.309f, 234.082f, 166.492f, 255.35f, 206.31f, 376f)
                curveTo(176.79f, 357.55f, 144f, 324.08f, 144f, 271.94f)
                curveToRelative(0f, -109.334f, 129.14f, -118.947f, 240f, -119.85f)
                verticalLineTo(48f)
                lineToRelative(144f, 144f)
                lineToRelative(-144f, 144f)
                close()
                moveToRelative(24.74f, 84.493f)
                arcToRelative(82.658f, 82.658f, 0f, false, false, 20.974f, -9.303f)
                curveToRelative(7.976f, -4.952f, 18.286f, 0.826f, 18.286f, 10.214f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(132f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(4.486f)
                curveToRelative(0f, 4.917f, -2.987f, 9.369f, -7.569f, 11.152f)
                curveToRelative(-13.702f, 5.331f, -26.396f, 11.537f, -38.05f, 18.585f)
                arcToRelative(12.138f, 12.138f, 0f, false, true, -6.28f, 1.777f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(340f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(340f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-25.966f)
                curveToRelative(0f, -5.37f, 3.579f, -10.059f, 8.74f, -11.541f)
                close()
            }
        }.build()
        
        return _ShareSquare!!
    }

private var _ShareSquare: ImageVector? = null

