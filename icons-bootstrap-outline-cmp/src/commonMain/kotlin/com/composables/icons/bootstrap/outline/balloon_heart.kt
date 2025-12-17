package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BalloonHeart: ImageVector
    get() {
        if (_BalloonHeart != null) return _BalloonHeart!!
        
        _BalloonHeart = ImageVector.Builder(
            name = "balloon-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2.42f)
                lineToRelative(-0.717f, -0.737f)
                curveToRelative(-1.13f, -1.161f, -3.243f, -0.777f, -4.01f, 0.72f)
                curveToRelative(-0.35f, 0.685f, -0.451f, 1.707f, 0.236f, 3.062f)
                curveTo(4.16f, 6.753f, 5.52f, 8.32f, 8f, 10.042f)
                curveToRelative(2.479f, -1.723f, 3.839f, -3.29f, 4.491f, -4.577f)
                curveToRelative(0.687f, -1.355f, 0.587f, -2.377f, 0.236f, -3.061f)
                curveToRelative(-0.767f, -1.498f, -2.88f, -1.882f, -4.01f, -0.721f)
                close()
                moveToRelative(-0.49f, 8.5f)
                curveToRelative(-10.78f, -7.44f, -3f, -13.155f, 0.359f, -10.063f)
                quadToRelative(0.068f, 0.062f, 0.132f, 0.129f)
                quadToRelative(0.065f, -0.067f, 0.132f, -0.129f)
                curveToRelative(3.36f, -3.092f, 11.137f, 2.624f, 0.357f, 10.063f)
                lineToRelative(0.235f, 0.468f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.448f, 0.224f)
                lineToRelative(-0.008f, -0.017f)
                curveToRelative(0.008f, 0.11f, 0.02f, 0.202f, 0.037f, 0.29f)
                curveToRelative(0.054f, 0.27f, 0.161f, 0.488f, 0.419f, 1.003f)
                curveToRelative(0.288f, 0.578f, 0.235f, 1.15f, 0.076f, 1.629f)
                curveToRelative(-0.157f, 0.469f, -0.422f, 0.867f, -0.588f, 1.115f)
                lineToRelative(-0.004f, 0.007f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.416f, -0.278f)
                curveToRelative(0.168f, -0.252f, 0.4f, -0.6f, 0.533f, -1.003f)
                curveToRelative(0.133f, -0.396f, 0.163f, -0.824f, -0.049f, -1.246f)
                lineToRelative(-0.013f, -0.028f)
                curveToRelative(-0.24f, -0.48f, -0.38f, -0.758f, -0.448f, -1.102f)
                arcToRelative(3f, 3f, 0f, false, true, -0.052f, -0.45f)
                lineToRelative(-0.04f, 0.08f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.447f, -0.224f)
                lineToRelative(0.235f, -0.468f)
                close()
                moveTo(6.013f, 2.06f)
                curveToRelative(-0.649f, -0.18f, -1.483f, 0.083f, -1.85f, 0.798f)
                curveToRelative(-0.131f, 0.258f, -0.245f, 0.689f, -0.08f, 1.335f)
                curveToRelative(0.063f, 0.244f, 0.414f, 0.198f, 0.487f, -0.043f)
                curveToRelative(0.21f, -0.697f, 0.627f, -1.447f, 1.359f, -1.692f)
                curveToRelative(0.217f, -0.073f, 0.304f, -0.337f, 0.084f, -0.398f)
            }
        }.build()
        
        return _BalloonHeart!!
    }

private var _BalloonHeart: ImageVector? = null

