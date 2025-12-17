package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                curveToRelative(-1.828f, 0f, -3.623f, 0.149f, -5.371f, 0.435f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.629f, 0.74f)
                verticalLineToRelative(0.387f)
                curveToRelative(-0.827f, 0.157f, -1.642f, 0.345f, -2.445f, 0.564f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.552f, 0.698f)
                arcToRelative(5f, 5f, 0f, false, false, 4.503f, 5.152f)
                arcToRelative(6f, 6f, 0f, false, false, 2.946f, 1.822f)
                arcTo(6.451f, 6.451f, 0f, false, true, 7.768f, 13f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6f, 14.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(-0.75f)
                curveTo(4.56f, 17f, 4f, 17.56f, 4f, 18.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(14f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-0.268f)
                arcToRelative(6.453f, 6.453f, 0f, false, true, -0.684f, -2.202f)
                arcToRelative(6f, 6f, 0f, false, false, 2.946f, -1.822f)
                arcToRelative(5f, 5f, 0f, false, false, 4.503f, -5.152f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.552f, -0.698f)
                arcTo(31.804f, 31.804f, 0f, false, false, 16f, 2.562f)
                verticalLineToRelative(-0.387f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.629f, -0.74f)
                arcTo(33.227f, 33.227f, 0f, false, false, 10f, 1f)
                close()
                moveTo(2.525f, 4.422f)
                curveTo(3.012f, 4.3f, 3.504f, 4.19f, 4f, 4.09f)
                verticalLineTo(5f)
                curveToRelative(0f, 0.74f, 0.134f, 1.448f, 0.38f, 2.103f)
                arcToRelative(3.503f, 3.503f, 0f, false, true, -1.855f, -2.68f)
                close()
                moveToRelative(14.95f, 0f)
                arcToRelative(3.503f, 3.503f, 0f, false, true, -1.854f, 2.68f)
                curveTo(15.866f, 6.449f, 16f, 5.74f, 16f, 5f)
                verticalLineToRelative(-0.91f)
                curveToRelative(0.496f, 0.099f, 0.988f, 0.21f, 1.475f, 0.332f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

