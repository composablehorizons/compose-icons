package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SourceControl: ImageVector
    get() {
        if (_SourceControl != null) return _SourceControl!!
        
        _SourceControl = ImageVector.Builder(
            name = "source-control",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 8.25f)
                curveTo(21f, 6.1815f, 19.3185f, 4.5f, 17.25f, 4.5f)
                curveTo(15.1815f, 4.5f, 13.5f, 6.1815f, 13.5f, 8.25f)
                curveTo(13.5f, 10.023f, 14.739f, 11.5035f, 16.395f, 11.892f)
                curveTo(16.116f, 12.819f, 15.2655f, 13.5f, 14.25f, 13.5f)
                horizontalLineTo(9.75f)
                curveTo(8.9025f, 13.5f, 8.1285f, 13.7925f, 7.5f, 14.268f)
                verticalLineTo(7.4235f)
                curveTo(9.21f, 7.0755f, 10.5f, 5.5605f, 10.5f, 3.75f)
                curveTo(10.5f, 1.6815f, 8.8185f, 0f, 6.75f, 0f)
                curveTo(4.6815f, 0f, 3f, 1.6815f, 3f, 3.75f)
                curveTo(3f, 5.562f, 4.29f, 7.0755f, 6f, 7.4235f)
                verticalLineTo(16.575f)
                curveTo(4.29f, 16.923f, 3f, 18.438f, 3f, 20.2485f)
                curveTo(3f, 22.317f, 4.6815f, 23.9985f, 6.75f, 23.9985f)
                curveTo(8.8185f, 23.9985f, 10.5f, 22.317f, 10.5f, 20.2485f)
                curveTo(10.5f, 18.4755f, 9.261f, 16.995f, 7.605f, 16.6065f)
                curveTo(7.884f, 15.6795f, 8.7345f, 14.9985f, 9.75f, 14.9985f)
                horizontalLineTo(14.25f)
                curveTo(16.0845f, 14.9985f, 17.61f, 13.6725f, 17.931f, 11.9295f)
                curveTo(19.674f, 11.607f, 21f, 10.0845f, 21f, 8.25f)
                close()
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 2.5095f, 5.5095f, 1.5f, 6.75f, 1.5f)
                curveTo(7.9905f, 1.5f, 9f, 2.5095f, 9f, 3.75f)
                curveTo(9f, 4.9905f, 7.9905f, 6f, 6.75f, 6f)
                curveTo(5.5095f, 6f, 4.5f, 4.9905f, 4.5f, 3.75f)
                close()
                moveTo(9f, 20.25f)
                curveTo(9f, 21.4905f, 7.9905f, 22.5f, 6.75f, 22.5f)
                curveTo(5.5095f, 22.5f, 4.5f, 21.4905f, 4.5f, 20.25f)
                curveTo(4.5f, 19.0095f, 5.5095f, 18f, 6.75f, 18f)
                curveTo(7.9905f, 18f, 9f, 19.0095f, 9f, 20.25f)
                close()
                moveTo(17.25f, 10.5f)
                curveTo(16.0095f, 10.5f, 15f, 9.4905f, 15f, 8.25f)
                curveTo(15f, 7.0095f, 16.0095f, 6f, 17.25f, 6f)
                curveTo(18.4905f, 6f, 19.5f, 7.0095f, 19.5f, 8.25f)
                curveTo(19.5f, 9.4905f, 18.4905f, 10.5f, 17.25f, 10.5f)
                close()
            }
        }.build()
        
        return _SourceControl!!
    }

private var _SourceControl: ImageVector? = null

